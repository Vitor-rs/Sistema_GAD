import { render } from '@testing-library/react';

import GadUiComponents from './ui-components';

describe('GadUiComponents', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<GadUiComponents />);
    expect(baseElement).toBeTruthy();
  });
});
